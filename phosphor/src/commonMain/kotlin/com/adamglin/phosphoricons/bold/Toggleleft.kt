package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.ToggleLeft: ImageVector
    get() {
        if (_toggleLeft != null) {
            return _toggleLeft!!
        }
        _toggleLeft = Builder(name = "ToggleLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 52.0f)
                lineTo(80.0f, 52.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 0.0f, 152.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 0.0f, -152.0f)
                close()
                moveTo(176.0f, 180.0f)
                lineTo(80.0f, 180.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 80.0f, 76.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 0.0f, 104.0f)
                close()
                moveTo(80.0f, 88.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 80.0f, 88.0f)
                close()
                moveTo(80.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 80.0f, 144.0f)
                close()
            }
        }
        .build()
        return _toggleLeft!!
    }

private var _toggleLeft: ImageVector? = null

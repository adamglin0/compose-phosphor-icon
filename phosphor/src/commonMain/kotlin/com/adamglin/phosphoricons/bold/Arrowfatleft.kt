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

public val BoldGroup.ArrowFatLeft: ImageVector
    get() {
        if (_arrowFatLeft != null) {
            return _arrowFatLeft!!
        }
        _arrowFatLeft = Builder(name = "ArrowFatLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 68.0f)
                lineTo(132.0f, 68.0f)
                lineTo(132.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.49f, -8.48f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(96.0f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 132.0f, 224.0f)
                lineTo(132.0f, 188.0f)
                horizontalLineToRelative(76.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 88.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 68.0f)
                close()
                moveTo(204.0f, 164.0f)
                lineTo(120.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(19.0f)
                lineTo(41.0f, 128.0f)
                lineToRelative(67.0f, -67.0f)
                lineTo(108.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(84.0f)
                close()
            }
        }
        .build()
        return _arrowFatLeft!!
    }

private var _arrowFatLeft: ImageVector? = null

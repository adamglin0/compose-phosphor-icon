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

public val BoldGroup.Sidebar: ImageVector
    get() {
        if (_sidebar != null) {
            return _sidebar!!
        }
        _sidebar = Builder(name = "Sidebar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 36.0f)
                lineTo(40.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 56.0f)
                lineTo(20.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 36.0f)
                close()
                moveTo(44.0f, 104.0f)
                lineTo(72.0f, 104.0f)
                verticalLineToRelative(20.0f)
                lineTo(44.0f, 124.0f)
                close()
                moveTo(72.0f, 60.0f)
                lineTo(72.0f, 80.0f)
                lineTo(44.0f, 80.0f)
                lineTo(44.0f, 60.0f)
                close()
                moveTo(44.0f, 148.0f)
                lineTo(72.0f, 148.0f)
                verticalLineToRelative(48.0f)
                lineTo(44.0f, 196.0f)
                close()
                moveTo(212.0f, 196.0f)
                lineTo(96.0f, 196.0f)
                lineTo(96.0f, 60.0f)
                lineTo(212.0f, 60.0f)
                close()
            }
        }
        .build()
        return _sidebar!!
    }

private var _sidebar: ImageVector? = null

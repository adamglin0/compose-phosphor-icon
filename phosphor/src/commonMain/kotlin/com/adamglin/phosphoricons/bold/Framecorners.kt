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

public val BoldGroup.Framecorners: ImageVector
    get() {
        if (_framecorners != null) {
            return _framecorners!!
        }
        _framecorners = Builder(name = "Framecorners", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(172.0f, 100.0f)
                lineTo(152.0f, 100.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 88.0f)
                close()
                moveTo(72.0f, 180.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(84.0f, 156.0f)
                lineTo(84.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 72.0f, 180.0f)
                close()
                moveTo(236.0f, 56.0f)
                lineTo(236.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(40.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(20.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 40.0f, 36.0f)
                lineTo(216.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 236.0f, 56.0f)
                close()
                moveTo(212.0f, 60.0f)
                lineTo(44.0f, 60.0f)
                lineTo(44.0f, 196.0f)
                lineTo(212.0f, 196.0f)
                close()
            }
        }
        .build()
        return _framecorners!!
    }

private var _framecorners: ImageVector? = null

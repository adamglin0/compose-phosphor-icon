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

public val BoldGroup.MagnetStraight: ImageVector
    get() {
        if (_magnetStraight != null) {
            return _magnetStraight!!
        }
        _magnetStraight = Builder(name = "MagnetStraight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 36.0f)
                lineTo(160.0f, 36.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 96.0f, 36.0f)
                lineTo(56.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 56.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 92.0f, 92.0f)
                horizontalLineToRelative(0.71f)
                curveToRelative(50.34f, -0.38f, 91.3f, -42.1f, 91.3f, -93.0f)
                lineTo(220.01f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 36.0f)
                close()
                moveTo(196.0f, 60.0f)
                lineTo(196.0f, 84.0f)
                lineTo(164.0f, 84.0f)
                lineTo(164.0f, 60.0f)
                close()
                moveTo(92.0f, 60.0f)
                lineTo(92.0f, 84.0f)
                lineTo(60.0f, 84.0f)
                lineTo(60.0f, 60.0f)
                close()
                moveTo(128.52f, 212.0f)
                lineTo(128.0f, 212.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, -68.0f, -68.0f)
                lineTo(60.0f, 108.0f)
                lineTo(92.0f, 108.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 72.0f, 0.0f)
                lineTo(164.0f, 108.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(35.0f)
                curveTo(196.0f, 180.77f, 165.73f, 211.72f, 128.52f, 212.0f)
                close()
            }
        }
        .build()
        return _magnetStraight!!
    }

private var _magnetStraight: ImageVector? = null

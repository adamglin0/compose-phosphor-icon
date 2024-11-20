package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.FlagBannerFold: ImageVector
    get() {
        if (_flagBannerFold != null) {
            return _flagBannerFold!!
        }
        _flagBannerFold = Builder(name = "FlagBannerFold", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.36f, 45.83f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 232.0f, 44.0f)
                lineTo(152.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.64f, 2.34f)
                lineTo(138.52f, 68.0f)
                lineTo(28.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.0f, 6.69f)
                lineTo(62.59f, 116.0f)
                lineTo(25.0f, 157.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 28.0f, 164.0f)
                horizontalLineToRelative(73.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.64f, -2.35f)
                lineTo(114.58f, 140.0f)
                horizontalLineToRelative(71.21f)
                lineToRelative(-37.43f, 82.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 5.3f)
                arcTo(4.07f, 4.07f, 0.0f, false, false, 152.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.64f, -2.35f)
                lineToRelative(80.0f, -176.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 235.36f, 45.83f)
                close()
                moveTo(98.52f, 156.0f)
                lineTo(37.0f, 156.0f)
                lineTo(71.0f, 118.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.38f)
                lineTo(37.0f, 76.0f)
                horizontalLineToRelative(97.84f)
                close()
                moveTo(189.42f, 132.0f)
                lineTo(118.21f, 132.0f)
                lineToRelative(36.37f, -80.0f)
                horizontalLineToRelative(71.21f)
                close()
            }
        }
        .build()
        return _flagBannerFold!!
    }

private var _flagBannerFold: ImageVector? = null

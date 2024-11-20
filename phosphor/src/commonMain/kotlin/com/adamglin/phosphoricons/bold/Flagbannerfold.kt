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

public val BoldGroup.FlagBannerFold: ImageVector
    get() {
        if (_flagBannerFold != null) {
            return _flagBannerFold!!
        }
        _flagBannerFold = Builder(name = "FlagBannerFold", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.09f, 41.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.0f, 36.0f)
                lineTo(152.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.92f, 7.0f)
                lineToRelative(-7.72f, 17.0f)
                lineTo(28.0f, 60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.88f, 20.07f)
                lineTo(51.78f, 116.0f)
                lineTo(19.12f, 151.93f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 172.0f)
                horizontalLineToRelative(73.09f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 112.0f, 165.0f)
                lineToRelative(7.71f, -17.0f)
                horizontalLineToRelative(53.63f)
                lineToRelative(-32.28f, 71.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 162.92f, 229.0f)
                lineToRelative(80.0f, -176.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 242.09f, 41.5f)
                close()
                moveTo(55.13f, 148.0f)
                lineToRelative(21.75f, -23.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -16.14f)
                lineTo(55.13f, 84.0f)
                horizontalLineToRelative(67.32f)
                lineTo(93.36f, 148.0f)
                close()
                moveTo(184.27f, 124.0f)
                lineTo(130.64f, 124.0f)
                lineToRelative(29.09f, -64.0f)
                horizontalLineToRelative(53.63f)
                close()
            }
        }
        .build()
        return _flagBannerFold!!
    }

private var _flagBannerFold: ImageVector? = null

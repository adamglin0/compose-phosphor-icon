package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.FlagBannerFold: ImageVector
    get() {
        if (_flagBannerFold != null) {
            return _flagBannerFold!!
        }
        _flagBannerFold = Builder(name = "FlagBannerFold", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(141.09f, 72.0f)
                lineToRelative(-40.0f, 88.0f)
                horizontalLineTo(28.0f)
                lineToRelative(40.0f, -44.0f)
                lineTo(28.0f, 72.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.73f, 43.67f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 40.0f)
                lineTo(152.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.28f, 4.69f)
                lineTo(135.94f, 64.0f)
                lineTo(28.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.92f, 13.38f)
                lineTo(57.19f, 116.0f)
                lineTo(22.08f, 154.62f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 28.0f, 168.0f)
                horizontalLineToRelative(73.09f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.28f, -4.69f)
                lineTo(117.15f, 144.0f)
                horizontalLineToRelative(62.43f)
                lineToRelative(-34.86f, 76.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.56f, 6.62f)
                lineToRelative(80.0f, -176.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 238.73f, 43.67f)
                close()
                moveTo(95.94f, 152.0f)
                lineTo(46.08f, 152.0f)
                lineToRelative(27.84f, -30.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -10.76f)
                lineTo(46.08f, 80.0f)
                horizontalLineToRelative(82.59f)
                close()
                moveTo(186.85f, 128.0f)
                lineTo(124.42f, 128.0f)
                lineToRelative(32.73f, -72.0f)
                horizontalLineToRelative(62.43f)
                close()
            }
        }
        .build()
        return _flagBannerFold!!
    }

private var _flagBannerFold: ImageVector? = null

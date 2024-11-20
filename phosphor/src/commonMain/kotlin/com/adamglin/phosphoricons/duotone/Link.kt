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

public val DuotoneGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(218.34f, 119.6f)
                lineTo(183.6f, 154.34f)
                arcToRelative(46.58f, 46.58f, 0.0f, false, true, -44.31f, 12.26f)
                curveToRelative(-0.31f, 0.34f, -0.62f, 0.67f, -0.95f, 1.0f)
                lineTo(103.6f, 202.34f)
                arcTo(46.63f, 46.63f, 0.0f, true, true, 37.66f, 136.4f)
                lineTo(72.4f, 101.66f)
                arcTo(46.6f, 46.6f, 0.0f, false, true, 116.71f, 89.4f)
                curveToRelative(0.31f, -0.34f, 0.62f, -0.67f, 1.0f, -1.0f)
                lineTo(152.4f, 53.66f)
                arcToRelative(46.63f, 46.63f, 0.0f, false, true, 65.94f, 65.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 88.23f)
                arcToRelative(54.43f, 54.43f, 0.0f, false, true, -16.0f, 37.0f)
                lineTo(189.25f, 160.0f)
                arcToRelative(54.27f, 54.27f, 0.0f, false, true, -38.63f, 16.0f)
                horizontalLineToRelative(-0.05f)
                arcTo(54.63f, 54.63f, 0.0f, false, true, 96.0f, 119.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.45f)
                arcTo(38.62f, 38.62f, 0.0f, false, false, 150.58f, 160.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(38.39f, 38.39f, 0.0f, false, false, 27.31f, -11.31f)
                lineToRelative(34.75f, -34.75f)
                arcToRelative(38.63f, 38.63f, 0.0f, false, false, -54.63f, -54.63f)
                lineToRelative(-11.0f, 11.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 135.7f, 59.0f)
                lineToRelative(11.0f, -11.0f)
                arcTo(54.65f, 54.65f, 0.0f, false, true, 224.0f, 48.0f)
                arcTo(54.86f, 54.86f, 0.0f, false, true, 240.0f, 88.23f)
                close()
                moveTo(109.0f, 185.66f)
                lineToRelative(-11.0f, 11.0f)
                arcTo(38.41f, 38.41f, 0.0f, false, true, 70.6f, 208.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(38.63f, 38.63f, 0.0f, false, true, -27.29f, -65.94f)
                lineTo(78.0f, 107.31f)
                arcTo(38.63f, 38.63f, 0.0f, false, true, 144.0f, 135.71f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.78f, 8.22f)
                horizontalLineTo(152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -7.78f)
                arcTo(54.86f, 54.86f, 0.0f, false, false, 144.0f, 96.0f)
                arcToRelative(54.65f, 54.65f, 0.0f, false, false, -77.27f, 0.0f)
                lineTo(32.0f, 130.75f)
                arcTo(54.62f, 54.62f, 0.0f, false, false, 70.56f, 224.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(54.28f, 54.28f, 0.0f, false, false, 38.64f, -16.0f)
                lineToRelative(11.0f, -11.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 109.0f, 185.66f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null

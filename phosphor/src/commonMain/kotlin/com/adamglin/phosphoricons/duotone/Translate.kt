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

public val DuotoneGroup.Translate: ImageVector
    get() {
        if (_translate != null) {
            return _translate!!
        }
        _translate = Builder(name = "Translate", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 184.0f)
                horizontalLineTo(144.0f)
                lineToRelative(40.0f, -80.0f)
                close()
                moveTo(96.0f, 127.56f)
                horizontalLineToRelative(0.0f)
                arcTo(95.78f, 95.78f, 0.0f, false, false, 128.0f, 56.0f)
                horizontalLineTo(64.0f)
                arcTo(95.78f, 95.78f, 0.0f, false, false, 96.0f, 127.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.15f, 212.42f)
                lineToRelative(-56.0f, -112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.31f, 0.0f)
                lineToRelative(-21.71f, 43.43f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 108.0f, 126.93f)
                arcTo(103.65f, 103.65f, 0.0f, false, false, 135.69f, 64.0f)
                horizontalLineTo(160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(104.0f)
                verticalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(48.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(87.63f)
                arcTo(87.7f, 87.7f, 0.0f, false, true, 96.0f, 116.35f)
                arcToRelative(87.74f, 87.74f, 0.0f, false, true, -19.0f, -31.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.08f, 5.34f)
                arcTo(103.63f, 103.63f, 0.0f, false, false, 84.0f, 127.0f)
                arcToRelative(87.55f, 87.55f, 0.0f, false, true, -52.0f, 17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcToRelative(103.46f, 103.46f, 0.0f, false, false, 64.0f, -22.08f)
                arcToRelative(104.18f, 104.18f, 0.0f, false, false, 51.44f, 21.31f)
                lineToRelative(-26.6f, 53.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.31f, 7.16f)
                lineTo(148.94f, 192.0f)
                horizontalLineToRelative(70.11f)
                lineToRelative(13.79f, 27.58f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 240.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.15f, -11.58f)
                close()
                moveTo(156.94f, 176.0f)
                lineTo(184.0f, 121.89f)
                lineTo(211.05f, 176.0f)
                close()
            }
        }
        .build()
        return _translate!!
    }

private var _translate: ImageVector? = null

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

public val DuotoneGroup.Feather: ImageVector
    get() {
        if (_feather != null) {
            return _feather!!
        }
        _feather = Builder(name = "Feather", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(215.8f, 119.6f)
                lineToRelative(-69.26f, 70.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.65f, 2.34f)
                horizontalLineTo(64.2f)
                verticalLineTo(115.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.34f, -5.65f)
                lineTo(112.2f, 64.52f)
                verticalLineTo(144.0f)
                lineToRelative(24.0f, -24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.28f, 34.75f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -90.49f, 0.0f)
                lineTo(60.69f, 104.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 56.0f, 115.31f)
                verticalLineToRelative(73.38f)
                lineTo(26.34f, 218.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineTo(67.32f, 200.0f)
                horizontalLineTo(140.7f)
                arcTo(15.92f, 15.92f, 0.0f, false, false, 152.0f, 195.32f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(69.23f, -70.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 221.28f, 34.75f)
                close()
                moveTo(142.07f, 46.06f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 211.79f, 112.0f)
                horizontalLineTo(155.33f)
                lineToRelative(34.35f, -34.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineTo(120.0f, 124.69f)
                verticalLineTo(67.87f)
                close()
                moveTo(72.0f, 115.35f)
                lineToRelative(32.0f, -31.67f)
                verticalLineToRelative(57.0f)
                lineToRelative(-32.0f, 32.0f)
                close()
                moveTo(140.7f, 184.0f)
                horizontalLineTo(83.32f)
                lineToRelative(56.0f, -56.0f)
                horizontalLineToRelative(56.74f)
                close()
            }
        }
        .build()
        return _feather!!
    }

private var _feather: ImageVector? = null

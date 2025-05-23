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

public val DuotoneGroup.SneakerMove: ImageVector
    get() {
        if (_sneakerMove != null) {
            return _sneakerMove!!
        }
        _sneakerMove = Builder(name = "SneakerMove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 180.94f)
                verticalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(148.06f)
                lineTo(34.34f, 94.28f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 35.0f, 82.41f)
                lineTo(112.0f, 24.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 56.0f, 56.0f)
                verticalLineToRelative(29.39f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 31.0f, 50.09f)
                lineToRelative(28.62f, 14.31f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 180.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.16f, 166.63f)
                lineToRelative(-28.63f, -14.31f)
                arcTo(47.74f, 47.74f, 0.0f, false, true, 176.0f, 109.39f)
                lineTo(176.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.83f, -6.37f)
                lineTo(30.13f, 76.0f)
                lineToRelative(-0.2f, 0.16f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.24f, 23.75f)
                lineTo(142.4f, 213.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, 2.34f)
                lineTo(224.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(240.0f, 180.94f)
                arcTo(15.92f, 15.92f, 0.0f, false, false, 231.16f, 166.63f)
                close()
                moveTo(224.0f, 200.0f)
                lineTo(151.37f, 200.0f)
                lineTo(40.0f, 88.63f)
                lineToRelative(12.87f, -9.76f)
                lineToRelative(38.79f, 38.79f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 103.0f, 106.34f)
                lineTo(65.74f, 69.11f)
                lineToRelative(40.0f, -30.31f)
                arcTo(64.15f, 64.15f, 0.0f, false, false, 160.0f, 87.5f)
                verticalLineToRelative(21.89f)
                arcToRelative(63.65f, 63.65f, 0.0f, false, false, 35.38f, 57.24f)
                lineTo(224.0f, 180.94f)
                close()
                moveTo(70.8f, 184.0f)
                lineTo(32.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(70.8f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                close()
                moveTo(110.8f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(48.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(54.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 110.8f, 208.0f)
                close()
            }
        }
        .build()
        return _sneakerMove!!
    }

private var _sneakerMove: ImageVector? = null

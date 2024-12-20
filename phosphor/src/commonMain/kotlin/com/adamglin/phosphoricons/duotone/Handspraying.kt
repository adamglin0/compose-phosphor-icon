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

public val DuotoneGroup.HandsPraying: ImageVector
    get() {
        if (_handsPraying != null) {
            return _handsPraying!!
        }
        _handsPraying = Builder(name = "HandsPraying", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(229.66f, 197.0f)
                lineTo(197.0f, 229.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, 0.0f)
                lineToRelative(-18.35f, -18.35f)
                lineToRelative(44.0f, -44.0f)
                lineToRelative(18.35f, 18.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 229.66f, 197.0f)
                close()
                moveTo(26.34f, 185.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.31f)
                lineTo(59.0f, 229.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.31f, 0.0f)
                lineToRelative(18.35f, -18.35f)
                lineToRelative(-44.0f, -44.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.32f, 180.0f)
                lineToRelative(-36.24f, -36.25f)
                lineTo(162.62f, 23.46f)
                arcTo(21.76f, 21.76f, 0.0f, false, false, 128.0f, 12.93f)
                arcTo(21.76f, 21.76f, 0.0f, false, false, 93.38f, 23.46f)
                lineTo(56.92f, 143.76f)
                lineTo(20.68f, 180.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.62f)
                lineToRelative(32.69f, 32.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f)
                lineTo(124.28f, 187.0f)
                arcToRelative(40.68f, 40.68f, 0.0f, false, false, 3.72f, -4.29f)
                arcToRelative(40.68f, 40.68f, 0.0f, false, false, 3.72f, 4.29f)
                lineTo(180.0f, 235.32f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f)
                lineToRelative(32.69f, -32.69f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 235.32f, 180.0f)
                close()
                moveTo(64.68f, 224.0f)
                lineTo(32.0f, 191.32f)
                lineToRelative(12.69f, -12.69f)
                lineToRelative(32.69f, 32.69f)
                close()
                moveTo(120.0f, 158.75f)
                arcToRelative(23.85f, 23.85f, 0.0f, false, true, -7.0f, 17.0f)
                lineTo(88.68f, 200.0f)
                lineTo(56.0f, 167.32f)
                lineToRelative(13.65f, -13.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.0f, -3.34f)
                lineToRelative(37.0f, -122.22f)
                arcTo(5.78f, 5.78f, 0.0f, false, true, 120.0f, 29.78f)
                close()
                moveTo(143.0f, 175.75f)
                arcToRelative(23.85f, 23.85f, 0.0f, false, true, -7.0f, -17.0f)
                verticalLineToRelative(-129.0f)
                arcToRelative(5.78f, 5.78f, 0.0f, false, true, 11.31f, -1.68f)
                lineToRelative(37.0f, 122.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.0f, 3.34f)
                lineToRelative(14.49f, 14.49f)
                lineToRelative(-33.4f, 32.0f)
                close()
                moveTo(191.32f, 224.0f)
                lineToRelative(-12.56f, -12.57f)
                lineToRelative(33.39f, -32.0f)
                lineTo(224.0f, 191.32f)
                close()
            }
        }
        .build()
        return _handsPraying!!
    }

private var _handsPraying: ImageVector? = null

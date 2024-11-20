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

public val DuotoneGroup.Cricket: ImageVector
    get() {
        if (_cricket != null) {
            return _cricket!!
        }
        _cricket = Builder(name = "Cricket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(168.0f, 104.0f)
                verticalLineToRelative(64.0f)
                lineToRelative(-37.66f, 37.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, 0.0f)
                lineTo(66.34f, 153.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.31f)
                lineTo(104.0f, 104.0f)
                close()
                moveTo(80.0f, 60.0f)
                arcTo(20.0f, 20.0f, 0.0f, true, false, 60.0f, 80.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 80.0f, 60.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.31f, 81.37f)
                lineTo(190.63f, 28.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f)
                lineTo(60.69f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.63f)
                lineToRelative(20.68f, 20.68f)
                lineToRelative(-47.0f, 47.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(47.0f, -47.0f)
                lineToRelative(20.68f, 20.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f)
                lineTo(243.31f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.63f)
                close()
                moveTo(124.69f, 200.0f)
                lineTo(104.0f, 179.31f)
                lineToRelative(29.66f, -29.65f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineTo(92.69f, 168.0f)
                lineTo(72.0f, 147.31f)
                lineTo(107.31f, 112.0f)
                lineTo(160.0f, 112.0f)
                verticalLineToRelative(52.69f)
                close()
                moveTo(232.0f, 92.69f)
                lineToRelative(-56.0f, 56.0f)
                lineTo(176.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(123.31f, 96.0f)
                lineToRelative(56.0f, -56.0f)
                lineTo(232.0f, 92.68f)
                close()
                moveTo(60.0f, 88.0f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 32.0f, 60.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 60.0f, 88.0f)
                close()
                moveTo(60.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 48.0f, 60.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 60.0f, 48.0f)
                close()
            }
        }
        .build()
        return _cricket!!
    }

private var _cricket: ImageVector? = null

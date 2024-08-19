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

public val DuotoneGroup.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) {
            return _sunglasses!!
        }
        _sunglasses = Builder(name = "Sunglasses", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 136.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -72.0f, 0.0f)
                close()
                moveTo(152.0f, 136.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 72.0f, 0.0f)
                lineTo(224.0f, 136.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(56.0f)
                lineTo(40.0f, 128.0f)
                lineTo(40.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 24.0f, 72.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 88.0f, 0.0f)
                lineTo(112.0f, 144.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 88.0f, 0.0f)
                lineTo(232.0f, 72.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 200.0f, 40.0f)
                close()
                moveTo(212.63f, 177.31f)
                lineTo(179.31f, 144.0f)
                lineTo(216.0f, 144.0f)
                verticalLineToRelative(20.0f)
                arcTo(27.8f, 27.8f, 0.0f, false, true, 212.63f, 177.31f)
                close()
                moveTo(40.0f, 164.0f)
                lineTo(40.0f, 147.31f)
                lineToRelative(41.31f, 41.32f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 40.0f, 164.0f)
                close()
                moveTo(96.0f, 164.0f)
                arcToRelative(27.8f, 27.8f, 0.0f, false, true, -3.37f, 13.31f)
                lineTo(59.31f, 144.0f)
                lineTo(96.0f, 144.0f)
                close()
                moveTo(160.0f, 164.0f)
                lineTo(160.0f, 147.31f)
                lineToRelative(41.31f, 41.32f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 160.0f, 164.0f)
                close()
            }
        }
        .build()
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null

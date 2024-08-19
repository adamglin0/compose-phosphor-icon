package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) {
            return _sunglasses!!
        }
        _sunglasses = Builder(name = "Sunglasses", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(91.22f, 179.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, 0.0f)
                lineTo(58.34f, 157.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineToRelative(21.56f, 21.57f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 91.22f, 179.22f)
                close()
                moveTo(211.22f, 179.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, 0.0f)
                lineToRelative(-21.57f, -21.56f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineToRelative(21.56f, 21.57f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 211.22f, 179.22f)
                close()
            }
        }
        .build()
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null

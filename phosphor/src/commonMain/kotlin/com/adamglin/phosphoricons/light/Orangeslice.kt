package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.OrangeSlice: ImageVector
    get() {
        if (_orangeSlice != null) {
            return _orangeSlice!!
        }
        _orangeSlice = Builder(name = "OrangeSlice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 82.0f)
                lineTo(8.0f, 82.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                arcToRelative(126.0f, 126.0f, 0.0f, false, false, 252.0f, 0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 248.0f, 82.0f)
                close()
                moveTo(74.46f, 150.0f)
                lineTo(122.0f, 102.48f)
                verticalLineToRelative(67.28f)
                arcTo(81.66f, 81.66f, 0.0f, false, true, 74.46f, 150.0f)
                close()
                moveTo(66.0f, 141.54f)
                arcTo(81.66f, 81.66f, 0.0f, false, true, 46.24f, 94.0f)
                horizontalLineToRelative(67.28f)
                close()
                moveTo(134.0f, 102.48f)
                lineTo(181.54f, 150.0f)
                arcTo(81.66f, 81.66f, 0.0f, false, true, 134.0f, 169.76f)
                close()
                moveTo(190.0f, 141.54f)
                lineTo(142.48f, 94.0f)
                horizontalLineToRelative(67.28f)
                arcTo(81.66f, 81.66f, 0.0f, false, true, 190.0f, 141.54f)
                close()
                moveTo(128.0f, 202.0f)
                arcTo(114.14f, 114.14f, 0.0f, false, true, 14.16f, 94.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(94.0f, 94.0f, 0.0f, false, false, 187.6f, 0.0f)
                horizontalLineToRelative(20.0f)
                arcTo(114.14f, 114.14f, 0.0f, false, true, 128.0f, 202.0f)
                close()
            }
        }
        .build()
        return _orangeSlice!!
    }

private var _orangeSlice: ImageVector? = null

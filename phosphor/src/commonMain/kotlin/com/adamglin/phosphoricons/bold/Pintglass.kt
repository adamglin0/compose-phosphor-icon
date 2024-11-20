package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.PintGlass: ImageVector
    get() {
        if (_pintGlass != null) {
            return _pintGlass!!
        }
        _pintGlass = Builder(name = "PintGlass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.0f, -4.0f)
                horizontalLineTo(56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.09f, 33.43f)
                lineToRelative(23.15f, 193.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 87.1f, 244.0f)
                horizontalLineToRelative(81.8f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.86f, -17.62f)
                lineTo(211.91f, 33.43f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 209.0f, 24.0f)
                close()
                moveTo(186.47f, 44.0f)
                lineToRelative(-1.92f, 16.0f)
                horizontalLineTo(71.45f)
                lineTo(69.53f, 44.0f)
                close()
                moveTo(165.35f, 220.0f)
                horizontalLineTo(90.65f)
                lineTo(74.33f, 84.0f)
                horizontalLineTo(181.67f)
                close()
            }
        }
        .build()
        return _pintGlass!!
    }

private var _pintGlass: ImageVector? = null

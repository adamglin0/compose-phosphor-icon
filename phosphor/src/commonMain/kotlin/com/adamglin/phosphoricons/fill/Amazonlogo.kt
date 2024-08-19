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

public val FillGroup.Amazonlogo: ImageVector
    get() {
        if (_amazonlogo != null) {
            return _amazonlogo!!
        }
        _amazonlogo = Builder(name = "Amazonlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 136.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 152.0f, 136.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(152.0f, 104.0f)
                verticalLineToRelative(0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 64.0f)
                verticalLineToRelative(0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(168.0f, 104.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 94.13f, 82.71f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.54f, 8.52f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 152.0f, 104.0f)
                close()
                moveTo(196.81f, 169.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.2f, 1.58f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, -115.22f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -12.78f, 9.62f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 140.78f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 196.81f, 169.61f)
                close()
            }
        }
        .build()
        return _amazonlogo!!
    }

private var _amazonlogo: ImageVector? = null

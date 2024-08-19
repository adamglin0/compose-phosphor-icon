package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Baby: ImageVector
    get() {
        if (_baby != null) {
            return _baby!!
        }
        _baby = Builder(name = "Baby", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 140.0f)
                close()
                moveTo(164.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 116.0f)
                close()
                moveTo(151.73f, 161.23f)
                arcToRelative(45.0f, 45.0f, 0.0f, false, true, -47.46f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.54f, 13.54f)
                arcToRelative(61.0f, 61.0f, 0.0f, false, false, 64.54f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.54f, -13.54f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(216.0f, 128.0f)
                arcToRelative(88.11f, 88.11f, 0.0f, false, false, -84.09f, -87.91f)
                curveTo(120.32f, 56.38f, 120.0f, 71.88f, 120.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f)
                curveToRelative(0.0f, -0.73f, 0.13f, -14.3f, 8.46f, -30.63f)
                arcTo(88.0f, 88.0f, 0.0f, true, false, 216.0f, 128.0f)
                close()
            }
        }
        .build()
        return _baby!!
    }

private var _baby: ImageVector? = null

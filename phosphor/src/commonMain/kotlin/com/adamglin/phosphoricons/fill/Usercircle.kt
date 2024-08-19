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

public val FillGroup.Usercircle: ImageVector
    get() {
        if (_usercircle != null) {
            return _usercircle!!
        }
        _usercircle = Builder(name = "Usercircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 120.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, -44.0f, -44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 172.0f, 120.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(216.0f, 128.0f)
                arcToRelative(88.09f, 88.09f, 0.0f, false, false, -91.47f, -87.93f)
                curveTo(77.43f, 41.89f, 39.87f, 81.12f, 40.0f, 128.25f)
                arcToRelative(87.65f, 87.65f, 0.0f, false, false, 22.24f, 58.16f)
                arcTo(79.71f, 79.71f, 0.0f, false, true, 84.0f, 165.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.83f, 0.32f)
                arcToRelative(59.83f, 59.83f, 0.0f, false, false, 78.28f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.83f, -0.32f)
                arcToRelative(79.71f, 79.71f, 0.0f, false, true, 21.79f, 21.31f)
                arcTo(87.62f, 87.62f, 0.0f, false, false, 216.0f, 128.0f)
                close()
            }
        }
        .build()
        return _usercircle!!
    }

private var _usercircle: ImageVector? = null

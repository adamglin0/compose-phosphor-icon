package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.Volleyball: ImageVector
    get() {
        if (_volleyball != null) {
            return _volleyball!!
        }
        _volleyball = Builder(name = "Volleyball", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(209.74f, 160.58f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -93.49f, 3.78f)
                lineTo(132.62f, 136.0f)
                horizontalLineToRelative(83.0f)
                arcTo(87.16f, 87.16f, 0.0f, false, true, 209.74f, 160.58f)
                close()
                moveTo(91.12f, 48.11f)
                arcToRelative(87.57f, 87.57f, 0.0f, false, true, 24.22f, -7.2f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 50.0f, 79.09f)
                lineTo(132.62f, 120.0f)
                close()
                moveTo(215.63f, 120.0f)
                lineTo(181.37f, 120.0f)
                arcToRelative(104.18f, 104.18f, 0.0f, false, false, -35.78f, -78.23f)
                arcTo(88.18f, 88.18f, 0.0f, false, true, 215.63f, 120.0f)
                close()
                moveTo(77.27f, 56.13f)
                lineTo(94.39f, 85.78f)
                arcToRelative(104.14f, 104.14f, 0.0f, false, false, -49.86f, 70.09f)
                arcTo(87.95f, 87.95f, 0.0f, false, true, 77.27f, 56.13f)
                close()
                moveTo(58.9f, 182.43f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 43.49f, -82.79f)
                lineTo(118.76f, 128.0f)
                lineTo(77.27f, 199.87f)
                arcTo(88.62f, 88.62f, 0.0f, false, true, 58.9f, 182.43f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(87.5f, 87.5f, 0.0f, false, true, -36.88f, -8.11f)
                lineToRelative(17.13f, -29.67f)
                arcToRelative(104.23f, 104.23f, 0.0f, false, false, 85.53f, 8.17f)
                arcTo(87.81f, 87.81f, 0.0f, false, true, 128.0f, 216.0f)
                close()
            }
        }
        .build()
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null

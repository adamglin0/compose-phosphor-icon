package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Trademark-registered-fill`: ImageVector
    get() {
        if (`_trademark-registered-fill` != null) {
            return `_trademark-registered-fill`!!
        }
        `_trademark-registered-fill` = Builder(name = "Trademark-registered-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(112.0f, 128.0f)
                lineTo(112.0f, 96.0f)
                horizontalLineToRelative(24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 152.0f, 112.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(216.0f, 128.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, false, -88.0f, 88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 216.0f, 128.0f)
                close()
                moveTo(200.0f, 128.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, -72.0f, -72.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 200.0f, 128.0f)
                close()
                moveTo(166.66f, 163.56f)
                lineTo(151.09f, 140.21f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 136.0f, 80.0f)
                lineTo(104.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(112.0f, 144.0f)
                horizontalLineToRelative(22.39f)
                lineToRelative(19.0f, 28.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.32f, -8.88f)
                close()
            }
        }
        .build()
        return `_trademark-registered-fill`!!
    }

private var `_trademark-registered-fill`: ImageVector? = null

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

public val FillGroup.`Towel-fill`: ImageVector
    get() {
        if (`_towel-fill` != null) {
            return `_towel-fill`!!
        }
        `_towel-fill` = Builder(name = "Towel-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 48.0f)
                verticalLineTo(152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, 8.0f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, -7.47f, -8.25f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.55f, -8.0f)
                arcTo(8.19f, 8.19f, 0.0f, false, false, 192.0f, 48.28f)
                verticalLineTo(180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(48.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 72.0f, 24.0f)
                horizontalLineTo(200.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 224.0f, 48.0f)
                close()
                moveTo(188.0f, 200.0f)
                horizontalLineTo(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(204.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 188.0f, 200.0f)
                close()
            }
        }
        .build()
        return `_towel-fill`!!
    }

private var `_towel-fill`: ImageVector? = null

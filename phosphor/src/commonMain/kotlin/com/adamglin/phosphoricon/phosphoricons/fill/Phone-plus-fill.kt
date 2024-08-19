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

public val FillGroup.`Phone-plus-fill`: ImageVector
    get() {
        if (`_phone-plus-fill` != null) {
            return `_phone-plus-fill`!!
        }
        `_phone-plus-fill` = Builder(name = "Phone-plus-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.88f, 183.08f)
                arcTo(56.26f, 56.26f, 0.0f, false, true, 168.0f, 232.0f)
                curveTo(88.6f, 232.0f, 24.0f, 167.4f, 24.0f, 88.0f)
                arcTo(56.26f, 56.26f, 0.0f, false, true, 72.92f, 32.12f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.62f, 9.52f)
                lineToRelative(21.12f, 47.15f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, 0.0f, 0.12f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 109.39f, 104.0f)
                curveToRelative(-0.18f, 0.27f, -0.37f, 0.52f, -0.57f, 0.77f)
                lineTo(88.0f, 129.45f)
                curveToRelative(7.49f, 15.22f, 23.41f, 31.0f, 38.83f, 38.51f)
                lineToRelative(24.34f, -20.71f)
                arcToRelative(8.12f, 8.12f, 0.0f, false, true, 0.75f, -0.56f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 15.18f, -1.4f)
                lineToRelative(0.12f, 0.06f)
                lineToRelative(47.1f, 21.11f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 223.88f, 183.08f)
                close()
                moveTo(144.0f, 88.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(88.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(184.0f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(72.0f)
                horizontalLineTo(144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return `_phone-plus-fill`!!
    }

private var `_phone-plus-fill`: ImageVector? = null

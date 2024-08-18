package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Cat-fill`: ImageVector
    get() {
        if (`_cat-fill` != null) {
            return `_cat-fill`!!
        }
        `_cat-fill` = Builder(name = "Cat-fill", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.83f, 33.54f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -18.14f, 3.15f)
                curveToRelative(-0.14f, 0.14f, -0.26f, 0.27f, -0.38f, 0.41f)
                lineTo(187.05f, 57.0f)
                arcTo(111.28f, 111.28f, 0.0f, false, false, 69.0f, 57.0f)
                lineTo(51.69f, 37.1f)
                curveToRelative(-0.12f, -0.14f, -0.24f, -0.27f, -0.38f, -0.41f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -18.14f, -3.15f)
                arcTo(16.4f, 16.4f, 0.0f, false, false, 24.0f, 48.46f)
                lineTo(24.0f, 136.0f)
                curveToRelative(0.0f, 49.0f, 40.06f, 89.63f, 91.56f, 95.32f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.44f, -4.0f)
                verticalLineToRelative(-32.0f)
                lineToRelative(-13.42f, -13.43f)
                arcToRelative(8.22f, 8.22f, 0.0f, false, true, -0.41f, -11.37f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.49f, -0.18f)
                lineTo(128.0f, 180.68f)
                lineToRelative(10.34f, -10.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.49f, 0.18f)
                arcToRelative(8.22f, 8.22f, 0.0f, false, true, -0.41f, 11.37f)
                lineTo(136.0f, 195.31f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.44f, 4.0f)
                curveTo(191.94f, 225.62f, 232.0f, 185.0f, 232.0f, 136.0f)
                lineTo(232.0f, 48.46f)
                arcTo(16.4f, 16.4f, 0.0f, false, false, 222.83f, 33.54f)
                close()
                moveTo(84.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 152.0f)
                close()
                moveTo(104.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f)
                lineTo(88.0f, 69.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(136.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f)
                lineTo(120.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(152.0f, 88.0f)
                lineTo(152.0f, 69.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(168.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f)
                close()
                moveTo(172.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 152.0f)
                close()
            }
        }
        .build()
        return `_cat-fill`!!
    }

private var `_cat-fill`: ImageVector? = null

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

public val RegularGroup.`Bowl-food`: ImageVector
    get() {
        if (`_bowl-food` != null) {
            return `_bowl-food`!!
        }
        `_bowl-food` = Builder(name = "Bowl-food", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 104.0f)
                horizontalLineToRelative(-8.37f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, -175.26f, 0.0f)
                lineTo(32.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                arcToRelative(104.35f, 104.35f, 0.0f, false, false, 56.0f, 92.28f)
                lineTo(80.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-3.72f)
                arcTo(104.35f, 104.35f, 0.0f, false, false, 232.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 104.0f)
                close()
                moveTo(199.54f, 104.0f)
                lineTo(148.12f, 104.0f)
                arcToRelative(71.84f, 71.84f, 0.0f, false, true, 41.27f, -29.57f)
                arcTo(71.45f, 71.45f, 0.0f, false, true, 199.54f, 104.0f)
                close()
                moveTo(173.48f, 56.23f)
                quadToRelative(2.75f, 2.25f, 5.27f, 4.75f)
                arcToRelative(87.92f, 87.92f, 0.0f, false, false, -49.15f, 43.0f)
                lineTo(100.1f, 103.98f)
                arcTo(72.26f, 72.26f, 0.0f, false, true, 168.0f, 56.0f)
                curveTo(169.83f, 56.0f, 171.66f, 56.09f, 173.48f, 56.23f)
                close()
                moveTo(128.0f, 40.0f)
                arcToRelative(71.87f, 71.87f, 0.0f, false, true, 19.0f, 2.57f)
                arcTo(88.36f, 88.36f, 0.0f, false, false, 83.33f, 104.0f)
                lineTo(56.46f, 104.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 128.0f, 40.0f)
                close()
                moveTo(164.66f, 192.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 199.3f)
                lineTo(160.0f, 208.0f)
                lineTo(96.0f, 208.0f)
                verticalLineToRelative(-8.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 91.34f, 192.0f)
                arcToRelative(88.29f, 88.29f, 0.0f, false, true, -51.0f, -72.0f)
                lineTo(215.63f, 120.0f)
                arcTo(88.29f, 88.29f, 0.0f, false, true, 164.66f, 192.0f)
                close()
            }
        }
        .build()
        return `_bowl-food`!!
    }

private var `_bowl-food`: ImageVector? = null

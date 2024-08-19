package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Tennis-ball-thin`: ImageVector
    get() {
        if (`_tennis-ball-thin` != null) {
            return `_tennis-ball-thin`!!
        }
        `_tennis-ball-thin` = Builder(name = "Tennis-ball-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.74f, 57.29f)
                arcTo(99.39f, 99.39f, 0.0f, false, false, 128.0f, 28.0f)
                horizontalLineToRelative(-0.19f)
                arcToRelative(100.0f, 100.0f, 0.0f, true, false, 70.93f, 29.29f)
                close()
                moveTo(62.92f, 63.0f)
                arcToRelative(91.38f, 91.38f, 0.0f, false, true, 60.8f, -26.85f)
                arcTo(91.31f, 91.31f, 0.0f, false, true, 96.87f, 96.89f)
                arcTo(91.44f, 91.44f, 0.0f, false, true, 36.1f, 123.73f)
                arcTo(91.61f, 91.61f, 0.0f, false, true, 62.92f, 63.0f)
                close()
                moveTo(36.09f, 131.74f)
                arcToRelative(99.36f, 99.36f, 0.0f, false, false, 66.44f, -29.2f)
                arcToRelative(99.25f, 99.25f, 0.0f, false, false, 29.21f, -66.45f)
                arcToRelative(91.9f, 91.9f, 0.0f, false, true, 88.17f, 88.17f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, false, -95.65f, 95.65f)
                arcToRelative(91.9f, 91.9f, 0.0f, false, true, -88.17f, -88.17f)
                close()
                moveTo(193.09f, 193.05f)
                arcToRelative(91.38f, 91.38f, 0.0f, false, true, -60.8f, 26.85f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 87.62f, -87.63f)
                arcTo(91.61f, 91.61f, 0.0f, false, true, 193.08f, 193.05f)
                close()
            }
        }
        .build()
        return `_tennis-ball-thin`!!
    }

private var `_tennis-ball-thin`: ImageVector? = null

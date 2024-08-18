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

public val RegularGroup.`Circle-dashed`: ImageVector
    get() {
        if (`_circle-dashed` != null) {
            return `_circle-dashed`!!
        }
        `_circle-dashed` = Builder(name = "Circle-dashed", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.26f, 37.05f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 102.0f, 27.29f)
                arcToRelative(104.11f, 104.11f, 0.0f, false, true, 52.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.0f, 15.75f)
                arcToRelative(8.15f, 8.15f, 0.0f, false, true, -2.0f, -0.26f)
                arcToRelative(88.09f, 88.09f, 0.0f, false, false, -44.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.26f, 37.05f)
                close()
                moveTo(53.79f, 55.14f)
                arcToRelative(104.05f, 104.05f, 0.0f, false, false, -26.0f, 45.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.42f, 4.27f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 22.0f, -38.09f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 53.79f, 55.14f)
                close()
                moveTo(43.21f, 151.55f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.42f, 4.28f)
                arcToRelative(104.12f, 104.12f, 0.0f, false, false, 26.0f, 45.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.41f, -11.22f)
                arcTo(88.14f, 88.14f, 0.0f, false, true, 43.21f, 151.55f)
                close()
                moveTo(150.0f, 213.22f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -44.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -4.0f, 15.49f)
                arcToRelative(104.11f, 104.11f, 0.0f, false, false, 52.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.0f, -15.49f)
                close()
                moveTo(222.65f, 146.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.85f, 5.58f)
                arcToRelative(87.91f, 87.91f, 0.0f, false, true, -22.0f, 38.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.42f, 11.21f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 26.0f, -45.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 222.65f, 146.0f)
                close()
                moveTo(212.79f, 104.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.42f, -4.28f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, -26.0f, -45.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.41f, 11.22f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 212.79f, 104.45f)
                close()
            }
        }
        .build()
        return `_circle-dashed`!!
    }

private var `_circle-dashed`: ImageVector? = null

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

public val FillGroup.`User-circle-dashed-fill`: ImageVector
    get() {
        if (`_user-circle-dashed-fill` != null) {
            return `_user-circle-dashed-fill`!!
        }
        `_user-circle-dashed-fill` = Builder(name = "User-circle-dashed-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.26f, 37.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 102.0f, 27.29f)
                arcToRelative(104.11f, 104.11f, 0.0f, false, true, 52.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.0f, 15.75f)
                arcToRelative(8.15f, 8.15f, 0.0f, false, true, -2.0f, -0.26f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, -44.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.26f, 37.0f)
                close()
                moveTo(33.35f, 110.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.85f, -5.57f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 22.0f, -38.09f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 53.79f, 55.14f)
                arcToRelative(104.05f, 104.05f, 0.0f, false, false, -26.0f, 45.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 33.35f, 110.0f)
                close()
                moveTo(212.79f, 104.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.42f, -4.28f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, -26.0f, -45.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.41f, 11.22f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 212.79f, 104.45f)
                close()
                moveTo(222.66f, 146.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.85f, 5.58f)
                arcToRelative(87.61f, 87.61f, 0.0f, false, true, -19.0f, 34.83f)
                arcTo(79.75f, 79.75f, 0.0f, false, false, 172.0f, 165.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.83f, 0.31f)
                arcToRelative(59.81f, 59.81f, 0.0f, false, true, -78.27f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.84f, -0.31f)
                arcToRelative(79.52f, 79.52f, 0.0f, false, false, -22.0f, 21.12f)
                arcToRelative(87.7f, 87.7f, 0.0f, false, true, -18.83f, -34.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.42f, 4.28f)
                arcToRelative(104.07f, 104.07f, 0.0f, false, false, 200.46f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 222.66f, 146.0f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -44.0f, -44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 128.0f, 164.0f)
                close()
            }
        }
        .build()
        return `_user-circle-dashed-fill`!!
    }

private var `_user-circle-dashed-fill`: ImageVector? = null

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

public val FillGroup.`Tennis-ball-fill`: ImageVector
    get() {
        if (`_tennis-ball-fill` != null) {
            return `_tennis-ball-fill`!!
        }
        `_tennis-ball-fill` = Builder(name = "Tennis-ball-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.81f, 115.41f)
                arcToRelative(103.9f, 103.9f, 0.0f, false, true, 90.6f, -90.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.47f, 3.79f)
                arcToRelative(87.82f, 87.82f, 0.0f, false, true, -91.27f, 91.33f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 24.81f, 115.41f)
                close()
                moveTo(227.35f, 136.11f)
                curveToRelative(-1.12f, 0.0f, -2.23f, -0.07f, -3.35f, -0.07f)
                arcToRelative(87.84f, 87.84f, 0.0f, false, false, -87.88f, 91.41f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.47f, 3.79f)
                arcToRelative(103.9f, 103.9f, 0.0f, false, false, 90.6f, -90.66f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 227.35f, 136.11f)
                close()
                moveTo(150.46f, 150.46f)
                arcTo(103.33f, 103.33f, 0.0f, false, true, 224.0f, 120.0f)
                curveToRelative(1.0f, 0.0f, 2.06f, 0.0f, 3.09f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.12f, -4.43f)
                arcToRelative(103.91f, 103.91f, 0.0f, false, false, -90.88f, -90.89f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.43f, 4.12f)
                arcToRelative(103.72f, 103.72f, 0.0f, false, true, -30.36f, 76.7f)
                arcTo(103.33f, 103.33f, 0.0f, false, true, 32.0f, 136.0f)
                curveToRelative(-1.0f, 0.0f, -2.06f, 0.0f, -3.09f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.12f, 4.43f)
                arcToRelative(103.91f, 103.91f, 0.0f, false, false, 90.88f, 90.89f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.43f, -4.12f)
                arcTo(103.72f, 103.72f, 0.0f, false, true, 150.46f, 150.46f)
                close()
            }
        }
        .build()
        return `_tennis-ball-fill`!!
    }

private var `_tennis-ball-fill`: ImageVector? = null

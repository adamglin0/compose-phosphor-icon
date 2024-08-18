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

public val FillGroup.`Baby-fill`: ImageVector
    get() {
        if (`_baby-fill` != null) {
            return `_baby-fill`!!
        }
        `_baby-fill` = Builder(name = "Baby-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.16f, 24.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.56f, 1.81f)
                curveTo(120.3f, 41.48f, 120.0f, 55.79f, 120.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.68f, 7.79f)
                arcTo(8.24f, 8.24f, 0.0f, false, false, 136.0f, 55.68f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 144.8f, 48.0f)
                arcToRelative(8.14f, 8.14f, 0.0f, false, true, 7.2f, 8.23f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, -0.27f)
                curveToRelative(0.0f, -0.63f, 0.09f, -10.78f, 5.44f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.59f, -5.39f)
                arcTo(104.16f, 104.16f, 0.0f, false, false, 24.07f, 131.66f)
                curveTo(26.0f, 186.72f, 71.23f, 231.0f, 126.32f, 231.9f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 7.84f, -207.8f)
                close()
                moveTo(80.0f, 127.91f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 127.91f)
                close()
                moveTo(160.27f, 182.68f)
                arcToRelative(61.0f, 61.0f, 0.0f, false, true, -64.54f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.54f, -13.54f)
                arcToRelative(45.0f, 45.0f, 0.0f, false, false, 47.46f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.54f, 13.54f)
                close()
                moveTo(164.0f, 139.91f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 139.91f)
                close()
            }
        }
        .build()
        return `_baby-fill`!!
    }

private var `_baby-fill`: ImageVector? = null

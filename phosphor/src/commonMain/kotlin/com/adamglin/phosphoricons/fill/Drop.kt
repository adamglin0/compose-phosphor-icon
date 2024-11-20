package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Drop: ImageVector
    get() {
        if (_drop != null) {
            return _drop!!
        }
        _drop = Builder(name = "Drop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 47.75f)
                arcToRelative(254.19f, 254.19f, 0.0f, false, false, -41.45f, -38.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.18f, 0.0f)
                arcTo(254.19f, 254.19f, 0.0f, false, false, 82.0f, 47.75f)
                curveTo(54.51f, 79.32f, 40.0f, 112.6f, 40.0f, 144.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                curveTo(216.0f, 112.6f, 201.49f, 79.32f, 174.0f, 47.75f)
                close()
                moveTo(183.85f, 153.34f)
                arcToRelative(57.6f, 57.6f, 0.0f, false, true, -46.56f, 46.55f)
                arcTo(8.75f, 8.75f, 0.0f, false, true, 136.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.32f, -15.89f)
                curveToRelative(16.57f, -2.79f, 30.63f, -16.85f, 33.44f, -33.45f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.78f, 2.68f)
                close()
            }
        }
        .build()
        return _drop!!
    }

private var _drop: ImageVector? = null

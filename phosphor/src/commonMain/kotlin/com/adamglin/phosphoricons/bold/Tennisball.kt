package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) {
            return _tennisBall!!
        }
        _tennisBall = Builder(name = "TennisBall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.4f, 51.6f)
                arcToRelative(108.0f, 108.0f, 0.0f, true, false, 0.0f, 152.8f)
                arcTo(108.16f, 108.16f, 0.0f, false, false, 204.4f, 51.6f)
                close()
                moveTo(68.58f, 68.6f)
                arcToRelative(83.47f, 83.47f, 0.0f, false, true, 46.2f, -23.52f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, true, -69.72f, 69.72f)
                arcTo(83.47f, 83.47f, 0.0f, false, true, 68.58f, 68.58f)
                close()
                moveTo(44.74f, 139.07f)
                arcToRelative(107.27f, 107.27f, 0.0f, false, false, 63.45f, -30.88f)
                arcToRelative(107.27f, 107.27f, 0.0f, false, false, 30.88f, -63.45f)
                arcToRelative(83.84f, 83.84f, 0.0f, false, true, 72.19f, 72.19f)
                arcToRelative(108.11f, 108.11f, 0.0f, false, false, -94.33f, 94.32f)
                arcToRelative(83.82f, 83.82f, 0.0f, false, true, -72.19f, -72.18f)
                close()
                moveTo(187.42f, 187.42f)
                arcToRelative(83.53f, 83.53f, 0.0f, false, true, -46.2f, 23.52f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, true, 69.72f, -69.72f)
                arcTo(83.47f, 83.47f, 0.0f, false, true, 187.42f, 187.42f)
                close()
            }
        }
        .build()
        return _tennisBall!!
    }

private var _tennisBall: ImageVector? = null

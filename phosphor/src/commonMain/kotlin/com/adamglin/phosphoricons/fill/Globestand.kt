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

public val FillGroup.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) {
            return _globeStand!!
        }
        _globeStand = Builder(name = "GlobeStand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.0f, 104.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 80.0f, 80.0f)
                arcTo(80.09f, 80.09f, 0.0f, false, true, 56.0f, 104.0f)
                close()
                moveTo(202.46f, 173.28f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 66.72f, 37.54f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 55.18f, 26.46f)
                arcTo(112.0f, 112.0f, 0.0f, false, false, 128.0f, 215.71f)
                lineTo(128.0f, 232.0f)
                lineTo(104.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(144.0f, 232.0f)
                lineTo(144.0f, 215.72f)
                arcToRelative(111.21f, 111.21f, 0.0f, false, false, 69.54f, -30.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.08f, -11.54f)
                close()
            }
        }
        .build()
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null

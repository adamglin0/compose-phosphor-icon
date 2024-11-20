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

public val FillGroup.Ear: ImageVector
    get() {
        if (_ear != null) {
            return _ear!!
        }
        _ear = Builder(name = "Ear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(148.0f, 152.0f)
                arcToRelative(4.21f, 4.21f, 0.0f, false, false, 1.33f, -0.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.34f, 15.08f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 148.0f)
                curveToRelative(0.0f, -8.85f, 4.77f, -15.23f, 9.0f, -20.87f)
                curveToRelative(3.77f, -5.0f, 7.0f, -9.38f, 7.0f, -15.13f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f)
                curveToRelative(0.0f, 11.07f, -5.66f, 18.63f, -10.2f, 24.71f)
                curveToRelative(-3.6f, 4.81f, -5.8f, 7.93f, -5.8f, 11.29f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 148.0f, 152.0f)
                close()
                moveTo(184.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -96.0f, 0.0f)
                curveToRelative(0.0f, 11.9f, 6.71f, 20.5f, 13.82f, 29.6f)
                curveToRelative(7.0f, 8.92f, 14.18f, 18.15f, 14.18f, 30.4f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 34.0f, 14.29f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.19f, 11.42f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 92.0f, 172.0f)
                curveToRelative(0.0f, -6.74f, -5.0f, -13.14f, -10.79f, -20.55f)
                curveTo(73.54f, 141.63f, 64.0f, 129.41f, 64.0f, 112.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 128.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 120.0f)
                close()
            }
        }
        .build()
        return _ear!!
    }

private var _ear: ImageVector? = null

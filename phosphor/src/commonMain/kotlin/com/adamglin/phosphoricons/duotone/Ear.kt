package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Ear: ImageVector
    get() {
        if (_ear != null) {
            return _ear!!
        }
        _ear = Builder(name = "Ear", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 104.0f)
                curveToRelative(0.0f, 40.0f, -14.44f, 72.0f, -48.0f, 112.0f)
                curveToRelative(-8.07f, 9.77f, -18.34f, 16.0f, -32.0f, 16.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -44.0f, -44.0f)
                curveToRelative(0.0f, -41.49f, -36.0f, -28.0f, -36.0f, -84.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 160.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -144.0f, 0.0f)
                curveToRelative(0.0f, 26.7f, 8.53f, 34.92f, 17.57f, 43.64f)
                curveTo(82.21f, 156.0f, 92.0f, 165.41f, 92.0f, 188.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                curveToRelative(10.24f, 0.0f, 18.45f, -4.16f, 25.83f, -13.09f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.34f, 10.18f)
                curveTo(155.81f, 233.64f, 143.0f, 240.0f, 128.0f, 240.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, true, -52.0f, -52.0f)
                curveToRelative(0.0f, -15.79f, -5.68f, -21.27f, -13.54f, -28.84f)
                curveTo(52.46f, 149.5f, 40.0f, 137.5f, 40.0f, 104.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 176.0f, 0.0f)
                close()
                moveTo(177.87f, 161.08f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 166.93f, 164.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 160.0f)
                curveToRelative(0.0f, -9.33f, 4.82f, -15.76f, 10.4f, -23.2f)
                curveToRelative(6.37f, -8.5f, 13.6f, -18.13f, 13.6f, -32.8f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -96.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f)
                curveToRelative(0.0f, 9.33f, -4.82f, 15.76f, -10.4f, 23.2f)
                curveToRelative(-6.37f, 8.5f, -13.6f, 18.13f, -13.6f, 32.8f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 44.78f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 177.87f, 161.08f)
                close()
            }
        }
        .build()
        return _ear!!
    }

private var _ear: ImageVector? = null

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

public val FillGroup.Personsimplewalk: ImageVector
    get() {
        if (_personsimplewalk != null) {
            return _personsimplewalk!!
        }
        _personsimplewalk = Builder(name = "Personsimplewalk", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 48.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 120.0f, 48.0f)
                close()
                moveTo(208.0f, 136.0f)
                curveToRelative(-28.64f, 0.0f, -41.81f, -13.3f, -55.75f, -27.37f)
                curveToRelative(-3.53f, -3.57f, -7.18f, -7.26f, -11.0f, -10.58f)
                curveToRelative(-37.0f, -32.14f, -96.22f, 22.73f, -98.72f, 25.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.95f, 11.66f)
                arcTo(163.88f, 163.88f, 0.0f, false, true, 84.0f, 113.0f)
                curveToRelative(13.78f, -7.38f, 25.39f, -10.23f, 34.7f, -8.58f)
                lineTo(64.66f, 228.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.15f, 10.52f)
                arcTo(7.84f, 7.84f, 0.0f, false, false, 72.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.34f, -4.81f)
                lineToRelative(33.59f, -77.27f)
                lineTo(144.0f, 180.12f)
                lineTo(144.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(160.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.35f, -6.51f)
                lineToRelative(-37.2f, -26.57f)
                lineTo(132.88f, 112.0f)
                curveToRelative(2.64f, 2.44f, 5.26f, 5.07f, 8.0f, 7.84f)
                curveTo(155.05f, 134.19f, 172.69f, 152.0f, 208.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _personsimplewalk!!
    }

private var _personsimplewalk: ImageVector? = null

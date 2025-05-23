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

public val FillGroup.SunHorizon: ImageVector
    get() {
        if (_sunHorizon != null) {
            return _sunHorizon!!
        }
        _sunHorizon = Builder(name = "SunHorizon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(16.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(56.45f, 152.0f)
                arcToRelative(73.54f, 73.54f, 0.0f, false, true, -0.45f, -8.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 144.0f, 0.0f)
                arcToRelative(73.54f, 73.54f, 0.0f, false, true, -0.45f, 8.0f)
                lineTo(240.0f, 152.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 160.0f)
                close()
                moveTo(208.0f, 192.0f)
                lineTo(48.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(208.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(80.84f, 59.58f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.32f, -7.16f)
                lineToRelative(-8.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.32f, 7.16f)
                close()
                moveTo(20.42f, 103.16f)
                lineToRelative(16.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 7.16f, -14.31f)
                lineToRelative(-16.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.16f, 14.31f)
                close()
                moveTo(216.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.57f, -0.84f)
                lineToRelative(16.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.16f, -14.31f)
                lineToRelative(-16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 112.0f)
                close()
                moveTo(164.42f, 63.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.74f, -3.58f)
                lineToRelative(8.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.32f, -7.16f)
                lineToRelative(-8.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 164.42f, 63.16f)
                close()
            }
        }
        .build()
        return _sunHorizon!!
    }

private var _sunHorizon: ImageVector? = null

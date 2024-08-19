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

public val FillGroup.Handsclapping: ImageVector
    get() {
        if (_handsclapping != null) {
            return _handsclapping!!
        }
        _handsclapping = Builder(name = "Handsclapping", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.87f, 65.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 157.62f, 83.0f)
                lineTo(133.36f, 41.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -31.22f, 18.0f)
                lineTo(96.4f, 49.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 65.18f, 67.0f)
                lineToRelative(3.34f, 5.77f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 39.74f, 111.0f)
                lineToRelative(3.0f, 5.2f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 23.5f, 155.0f)
                lineToRelative(35.27f, 61.0f)
                arcToRelative(80.14f, 80.14f, 0.0f, false, false, 149.52f, -39.57f)
                arcTo(71.92f, 71.92f, 0.0f, false, false, 210.0f, 101.58f)
                close()
                moveTo(190.07f, 192.56f)
                arcTo(64.12f, 64.12f, 0.0f, false, true, 72.65f, 208.0f)
                lineTo(37.38f, 147.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 17.34f, -10.0f)
                lineTo(75.0f, 172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.87f, -8.0f)
                lineTo(53.62f, 103.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 71.0f, 93.0f)
                lineToRelative(31.81f, 55.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.87f, -8.0f)
                lineToRelative(-26.0f, -45.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 17.35f, -10.0f)
                lineToRelative(36.5f, 63.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.87f, -8.0f)
                lineToRelative(-12.6f, -21.75f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 163.44f, 109.0f)
                lineToRelative(20.22f, 35.0f)
                arcTo(63.52f, 63.52f, 0.0f, false, true, 190.07f, 192.57f)
                close()
                moveTo(160.22f, 24.0f)
                lineTo(160.22f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(176.22f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(193.44f, 30.0f)
                lineTo(201.44f, 16.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.68f, 8.33f)
                lineToRelative(-8.0f, 13.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.84f, 3.83f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 193.44f, 30.0f)
                close()
                moveTo(238.44f, 63.66f)
                lineTo(223.39f, 68.51f)
                arcToRelative(8.15f, 8.15f, 0.0f, false, true, -2.46f, 0.39f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.46f, -15.62f)
                lineToRelative(15.06f, -4.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 4.91f, 15.23f)
                close()
            }
        }
        .build()
        return _handsclapping!!
    }

private var _handsclapping: ImageVector? = null

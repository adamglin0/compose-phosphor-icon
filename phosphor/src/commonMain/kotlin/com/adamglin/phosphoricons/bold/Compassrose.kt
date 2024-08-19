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

public val BoldGroup.Compassrose: ImageVector
    get() {
        if (_compassrose != null) {
            return _compassrose!!
        }
        _compassrose = Builder(name = "Compassrose", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.0f, 116.39f)
                lineToRelative(-20.47f, -5.34f)
                arcTo(100.27f, 100.27f, 0.0f, false, false, 145.0f, 29.44f)
                lineTo(139.61f, 9.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.22f, 0.0f)
                lineToRelative(-5.34f, 20.47f)
                arcToRelative(100.27f, 100.27f, 0.0f, false, false, -81.61f, 81.61f)
                lineTo(9.0f, 116.39f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 23.22f)
                lineTo(29.44f, 145.0f)
                arcToRelative(100.27f, 100.27f, 0.0f, false, false, 81.61f, 81.61f)
                lineTo(116.39f, 247.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 23.22f, 0.0f)
                lineTo(145.0f, 226.56f)
                arcTo(100.27f, 100.27f, 0.0f, false, false, 226.56f, 145.0f)
                lineTo(247.0f, 139.61f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -23.22f)
                close()
                moveTo(200.12f, 104.16f)
                lineTo(161.81f, 94.16f)
                lineTo(151.81f, 55.85f)
                arcTo(76.32f, 76.32f, 0.0f, false, true, 200.15f, 104.16f)
                close()
                moveTo(117.32f, 100.38f)
                lineTo(128.0f, 59.54f)
                lineToRelative(10.65f, 40.84f)
                lineTo(128.0f, 111.0f)
                close()
                moveTo(128.0f, 145.0f)
                lineToRelative(10.65f, 10.65f)
                lineTo(128.0f, 196.46f)
                lineToRelative(-10.65f, -40.84f)
                close()
                moveTo(100.38f, 117.38f)
                lineTo(111.0f, 128.0f)
                lineToRelative(-10.65f, 10.65f)
                lineTo(59.54f, 128.0f)
                close()
                moveTo(155.62f, 138.68f)
                lineTo(145.0f, 128.0f)
                lineToRelative(10.65f, -10.65f)
                lineTo(196.46f, 128.0f)
                close()
                moveTo(104.16f, 55.88f)
                lineTo(94.16f, 94.19f)
                lineTo(55.85f, 104.19f)
                arcTo(76.32f, 76.32f, 0.0f, false, true, 104.16f, 55.85f)
                close()
                moveTo(55.85f, 151.88f)
                lineTo(94.16f, 161.88f)
                lineTo(104.16f, 200.19f)
                arcTo(76.32f, 76.32f, 0.0f, false, true, 55.85f, 151.84f)
                close()
                moveTo(151.85f, 200.19f)
                lineTo(161.85f, 161.88f)
                lineTo(200.16f, 151.88f)
                arcTo(76.32f, 76.32f, 0.0f, false, true, 151.84f, 200.15f)
                close()
            }
        }
        .build()
        return _compassrose!!
    }

private var _compassrose: ImageVector? = null

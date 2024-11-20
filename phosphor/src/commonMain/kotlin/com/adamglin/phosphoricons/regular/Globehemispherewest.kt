package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.GlobeHemisphereWest: ImageVector
    get() {
        if (_globeHemisphereWest != null) {
            return _globeHemisphereWest!!
        }
        _globeHemisphereWest = Builder(name = "GlobeHemisphereWest", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(216.0f, 128.0f)
                arcToRelative(87.62f, 87.62f, 0.0f, false, true, -6.4f, 32.94f)
                lineToRelative(-44.7f, -27.49f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, false, -6.24f, -2.23f)
                lineToRelative(-22.82f, -3.08f)
                arcToRelative(16.11f, 16.11f, 0.0f, false, false, -16.0f, 7.86f)
                horizontalLineToRelative(-8.72f)
                lineToRelative(-3.8f, -7.86f)
                arcToRelative(15.91f, 15.91f, 0.0f, false, false, -11.0f, -8.67f)
                lineToRelative(-8.0f, -1.73f)
                lineTo(96.14f, 104.0f)
                horizontalLineToRelative(16.71f)
                arcToRelative(16.06f, 16.06f, 0.0f, false, false, 7.73f, -2.0f)
                lineToRelative(12.25f, -6.76f)
                arcToRelative(16.62f, 16.62f, 0.0f, false, false, 3.0f, -2.14f)
                lineToRelative(26.91f, -24.34f)
                arcTo(15.93f, 15.93f, 0.0f, false, false, 166.0f, 49.1f)
                lineToRelative(-0.36f, -0.65f)
                arcTo(88.11f, 88.11f, 0.0f, false, true, 216.0f, 128.0f)
                close()
                moveTo(143.31f, 41.34f)
                lineTo(152.0f, 56.9f)
                lineTo(125.09f, 81.24f)
                lineTo(112.85f, 88.0f)
                lineTo(96.14f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -13.88f, 8.0f)
                lineToRelative(-8.73f, 15.23f)
                lineTo(63.38f, 84.19f)
                lineTo(74.32f, 58.32f)
                arcToRelative(87.87f, 87.87f, 0.0f, false, true, 69.0f, -17.0f)
                close()
                moveTo(40.0f, 128.0f)
                arcToRelative(87.53f, 87.53f, 0.0f, false, true, 8.54f, -37.8f)
                lineToRelative(11.34f, 30.27f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.62f, 10.0f)
                lineToRelative(21.43f, 4.61f)
                lineTo(96.74f, 143.0f)
                arcToRelative(16.09f, 16.09f, 0.0f, false, false, 14.4f, 9.0f)
                horizontalLineToRelative(1.48f)
                lineToRelative(-7.23f, 16.23f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 2.86f, 17.37f)
                lineToRelative(0.14f, 0.14f)
                lineTo(128.0f, 205.94f)
                lineToRelative(-1.94f, 10.0f)
                arcTo(88.11f, 88.11f, 0.0f, false, true, 40.0f, 128.0f)
                close()
                moveTo(142.58f, 214.78f)
                lineTo(143.71f, 208.97f)
                arcToRelative(16.09f, 16.09f, 0.0f, false, false, -4.0f, -13.9f)
                arcToRelative(1.85f, 1.85f, 0.0f, false, true, -0.14f, -0.14f)
                lineTo(120.0f, 174.74f)
                lineTo(133.7f, 144.0f)
                lineToRelative(22.82f, 3.08f)
                lineToRelative(45.72f, 28.12f)
                arcTo(88.18f, 88.18f, 0.0f, false, true, 142.58f, 214.78f)
                close()
            }
        }
        .build()
        return _globeHemisphereWest!!
    }

private var _globeHemisphereWest: ImageVector? = null

package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Codesandboxlogo: ImageVector
    get() {
        if (_codesandboxlogo != null) {
            return _codesandboxlogo!!
        }
        _codesandboxlogo = Builder(name = "Codesandboxlogo", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.76f, 69.66f)
                lineToRelative(-88.0f, -48.18f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.52f, 0.0f)
                lineToRelative(-88.0f, 48.18f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 80.18f)
                verticalLineToRelative(95.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.24f, 10.52f)
                lineToRelative(88.0f, 48.18f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, false, 11.52f, 0.0f)
                lineToRelative(88.0f, -48.18f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 228.0f, 175.82f)
                lineTo(228.0f, 80.18f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 221.76f, 69.66f)
                close()
                moveTo(128.0f, 123.44f)
                lineToRelative(-87.67f, -48.0f)
                lineTo(83.14f, 52.0f)
                lineToRelative(42.94f, 23.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.84f, 0.0f)
                lineTo(172.86f, 52.0f)
                lineToRelative(42.81f, 23.43f)
                close()
                moveTo(126.08f, 28.5f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, 3.84f, 0.0f)
                lineToRelative(34.61f, 19.0f)
                lineTo(128.0f, 67.44f)
                lineToRelative(-36.53f, -20.0f)
                close()
                moveTo(36.0f, 175.82f)
                lineTo(36.0f, 132.47f)
                lineToRelative(40.0f, 21.9f)
                verticalLineToRelative(45.72f)
                lineTo(38.08f, 179.33f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 175.82f)
                close()
                moveTo(84.0f, 204.47f)
                lineTo(84.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.08f, -3.51f)
                lineTo(36.0f, 123.35f)
                lineTo(36.0f, 82.19f)
                lineToRelative(88.0f, 48.18f)
                verticalLineToRelative(96.0f)
                close()
                moveTo(132.0f, 226.36f)
                verticalLineToRelative(-96.0f)
                lineToRelative(88.0f, -48.18f)
                verticalLineToRelative(41.16f)
                lineToRelative(-45.92f, 25.14f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 172.0f, 152.0f)
                verticalLineToRelative(52.47f)
                close()
                moveTo(217.92f, 179.36f)
                lineTo(180.0f, 200.09f)
                lineTo(180.0f, 154.37f)
                lineToRelative(40.0f, -21.9f)
                verticalLineToRelative(43.35f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 217.92f, 179.33f)
                close()
            }
        }
        .build()
        return _codesandboxlogo!!
    }

private var _codesandboxlogo: ImageVector? = null

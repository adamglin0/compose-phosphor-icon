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

public val RegularGroup.Codesandboxlogo: ImageVector
    get() {
        if (_codesandboxlogo != null) {
            return _codesandboxlogo!!
        }
        _codesandboxlogo = Builder(name = "Codesandboxlogo", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.68f, 66.15f)
                lineTo(135.68f, 18.0f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, -15.36f, 0.0f)
                lineToRelative(-88.0f, 48.18f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -8.32f, 14.0f)
                verticalLineToRelative(95.64f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.32f, 14.0f)
                lineToRelative(88.0f, 48.17f)
                arcToRelative(15.88f, 15.88f, 0.0f, false, false, 15.36f, 0.0f)
                lineToRelative(88.0f, -48.17f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.32f, -14.0f)
                lineTo(232.0f, 80.18f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 223.68f, 66.15f)
                close()
                moveTo(168.0f, 152.0f)
                verticalLineToRelative(50.09f)
                lineToRelative(-32.0f, 17.52f)
                lineTo(136.0f, 132.74f)
                lineToRelative(80.0f, -43.8f)
                verticalLineToRelative(32.0f)
                lineToRelative(-43.84f, 24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 152.0f)
                close()
                moveTo(83.84f, 145.0f)
                lineTo(40.0f, 121.0f)
                verticalLineToRelative(-32.0f)
                lineToRelative(80.0f, 43.8f)
                verticalLineToRelative(86.87f)
                lineTo(88.0f, 202.09f)
                lineTo(88.0f, 152.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 83.84f, 145.0f)
                close()
                moveTo(83.14f, 56.59f)
                lineTo(124.14f, 79.04f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.68f, 0.0f)
                lineToRelative(41.0f, -22.45f)
                lineToRelative(34.48f, 18.87f)
                lineTo(128.0f, 118.88f)
                lineTo(48.66f, 75.44f)
                close()
                moveTo(128.0f, 32.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(28.2f, 15.44f)
                lineTo(128.0f, 62.89f)
                lineTo(99.8f, 47.45f)
                close()
                moveTo(40.0f, 139.22f)
                lineToRelative(32.0f, 17.52f)
                verticalLineToRelative(36.59f)
                lineTo(40.0f, 175.82f)
                close()
                moveTo(184.0f, 193.33f)
                lineTo(184.0f, 156.74f)
                lineToRelative(32.0f, -17.52f)
                verticalLineToRelative(36.6f)
                close()
            }
        }
        .build()
        return _codesandboxlogo!!
    }

private var _codesandboxlogo: ImageVector? = null

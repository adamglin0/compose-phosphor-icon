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

public val FillGroup.CodesandboxLogo: ImageVector
    get() {
        if (_codesandboxLogo != null) {
            return _codesandboxLogo!!
        }
        _codesandboxLogo = Builder(name = "CodesandboxLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.89f, 72.25f)
                verticalLineToRelative(0.0f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, -6.18f, -6.06f)
                lineTo(135.68f, 18.0f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, -15.36f, 0.0f)
                lineToRelative(-88.0f, 48.18f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, -6.18f, 6.06f)
                lineToRelative(0.0f, 0.0f)
                verticalLineToRelative(0.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 80.18f)
                verticalLineToRelative(95.64f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.32f, 14.0f)
                lineToRelative(88.0f, 48.17f)
                arcToRelative(15.88f, 15.88f, 0.0f, false, false, 15.36f, 0.0f)
                lineToRelative(88.0f, -48.17f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.32f, -14.0f)
                lineTo(232.0f, 80.18f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 229.89f, 72.25f)
                close()
                moveTo(120.0f, 219.61f)
                lineTo(88.0f, 202.09f)
                lineTo(88.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.16f, -7.0f)
                lineTo(40.0f, 121.0f)
                verticalLineToRelative(-32.0f)
                lineToRelative(80.0f, 43.8f)
                close()
                moveTo(128.0f, 118.88f)
                lineTo(48.66f, 75.44f)
                lineTo(83.14f, 56.57f)
                lineToRelative(41.0f, 22.45f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.68f, 0.0f)
                lineToRelative(41.0f, -22.45f)
                lineToRelative(34.48f, 18.87f)
                close()
                moveTo(216.0f, 120.98f)
                lineTo(172.16f, 144.98f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.16f, 7.0f)
                verticalLineToRelative(50.09f)
                lineToRelative(-32.0f, 17.52f)
                lineTo(136.0f, 132.74f)
                lineToRelative(80.0f, -43.8f)
                close()
            }
        }
        .build()
        return _codesandboxLogo!!
    }

private var _codesandboxLogo: ImageVector? = null

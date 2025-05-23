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

public val RegularGroup.MicrosoftTeamsLogo: ImageVector
    get() {
        if (_microsoftTeamsLogo != null) {
            return _microsoftTeamsLogo!!
        }
        _microsoftTeamsLogo = Builder(name = "MicrosoftTeamsLogo", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(96.0f, 112.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(80.0f, 112.0f)
                lineTo(72.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 112.0f, 104.0f)
                close()
                moveTo(232.0f, 92.74f)
                lineTo(232.0f, 152.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -36.63f, 39.85f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, -118.7f, 0.15f)
                lineTo(40.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 64.0f)
                lineTo(96.81f, 64.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 73.31f, -28.85f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 211.69f, 80.0f)
                horizontalLineToRelative(7.57f)
                arcTo(12.76f, 12.76f, 0.0f, false, true, 232.0f, 92.74f)
                close()
                moveTo(112.0f, 56.0f)
                arcToRelative(23.82f, 23.82f, 0.0f, false, false, 1.38f, 8.0f)
                lineTo(136.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 15.07f, 10.68f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 112.0f, 56.0f)
                close()
                moveTo(136.0f, 176.0f)
                horizontalLineToRelative(0.0f)
                lineTo(136.0f, 80.0f)
                lineTo(40.0f, 80.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(96.0f)
                close()
                moveTo(184.0f, 96.0f)
                lineTo(152.0f, 96.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(94.44f, 192.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 184.0f, 168.0f)
                close()
                moveTo(200.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -24.4f, -13.6f)
                arcTo(39.89f, 39.89f, 0.0f, false, true, 168.0f, 80.0f)
                horizontalLineToRelative(16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 64.0f)
                close()
                moveTo(216.0f, 96.0f)
                lineTo(200.0f, 96.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(62.76f, 62.76f, 0.0f, false, true, -0.36f, 6.75f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 216.0f, 152.0f)
                close()
            }
        }
        .build()
        return _microsoftTeamsLogo!!
    }

private var _microsoftTeamsLogo: ImageVector? = null

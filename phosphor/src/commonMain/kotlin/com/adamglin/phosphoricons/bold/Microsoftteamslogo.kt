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

public val BoldGroup.MicrosoftTeamsLogo: ImageVector
    get() {
        if (_microsoftTeamsLogo != null) {
            return _microsoftTeamsLogo!!
        }
        _microsoftTeamsLogo = Builder(name = "MicrosoftTeamsLogo", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(76.0f, 116.0f)
                lineTo(72.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 104.0f)
                close()
                moveTo(240.0f, 92.74f)
                lineTo(240.0f, 152.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 198.0f, 196.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 76.0f, 200.0f)
                lineTo(36.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(16.0f, 76.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 36.0f, 56.0f)
                lineTo(92.0f, 56.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 80.51f, -24.53f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 221.94f, 76.0f)
                horizontalLineToRelative(1.32f)
                arcTo(16.76f, 16.76f, 0.0f, false, true, 240.0f, 92.74f)
                close()
                moveTo(180.0f, 55.09f)
                curveToRelative(0.0f, 0.3f, 0.0f, 0.6f, 0.0f, 0.91f)
                arcToRelative(44.14f, 44.14f, 0.0f, false, true, -4.77f, 20.0f)
                lineTo(188.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -8.0f, -20.91f)
                close()
                moveTo(116.0f, 56.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(19.93f, 19.93f, 0.0f, false, true, 14.86f, 6.66f)
                arcTo(20.25f, 20.25f, 0.0f, false, false, 156.0f, 56.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -40.0f, 0.0f)
                close()
                moveTo(40.0f, 176.0f)
                horizontalLineToRelative(96.0f)
                lineTo(136.0f, 80.0f)
                lineTo(40.0f, 80.0f)
                close()
                moveTo(180.0f, 168.0f)
                lineTo(180.0f, 100.0f)
                lineTo(160.0f, 100.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(105.86f, 200.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 180.0f, 168.0f)
                close()
                moveTo(216.0f, 100.0f)
                lineTo(204.0f, 100.0f)
                verticalLineToRelative(68.0f)
                curveToRelative(0.0f, 0.79f, 0.0f, 1.57f, -0.06f, 2.35f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 152.0f)
                close()
            }
        }
        .build()
        return _microsoftTeamsLogo!!
    }

private var _microsoftTeamsLogo: ImageVector? = null

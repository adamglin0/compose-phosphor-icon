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

public val RegularGroup.Scansmiley: ImageVector
    get() {
        if (_scansmiley != null) {
            return _scansmiley!!
        }
        _scansmiley = Builder(name = "Scansmiley", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 40.0f)
                lineTo(224.0f, 76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(208.0f, 48.0f)
                lineTo(180.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(36.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 40.0f)
                close()
                moveTo(216.0f, 172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(28.0f)
                lineTo(180.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(224.0f, 180.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 172.0f)
                close()
                moveTo(76.0f, 208.0f)
                lineTo(48.0f, 208.0f)
                lineTo(48.0f, 180.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(76.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(40.0f, 84.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(48.0f, 48.0f)
                lineTo(76.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(40.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(32.0f, 76.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 84.0f)
                close()
                moveTo(128.0f, 200.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 72.0f, -72.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 128.0f, 200.0f)
                close()
                moveTo(184.0f, 128.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, -56.0f, 56.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 184.0f, 128.0f)
                close()
                moveTo(116.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 116.0f, 116.0f)
                close()
                moveTo(152.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 152.0f, 104.0f)
                close()
                moveTo(146.71f, 146.0f)
                curveToRelative(-3.81f, 3.37f, -12.0f, 6.0f, -18.71f, 6.0f)
                reflectiveCurveToRelative(-14.9f, -2.63f, -18.71f, -6.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -10.58f, 12.0f)
                curveToRelative(7.83f, 6.91f, 20.35f, 10.0f, 29.29f, 10.0f)
                reflectiveCurveToRelative(21.46f, -3.09f, 29.29f, -10.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -10.58f, -12.0f)
                close()
            }
        }
        .build()
        return _scansmiley!!
    }

private var _scansmiley: ImageVector? = null

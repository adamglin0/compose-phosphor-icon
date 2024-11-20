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

public val BoldGroup.HandWithdraw: ImageVector
    get() {
        if (_handWithdraw != null) {
            return _handWithdraw!!
        }
        _handWithdraw = Builder(name = "HandWithdraw", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 198.65f)
                lineTo(236.0f, 240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(212.0f, 198.65f)
                arcTo(70.66f, 70.66f, 0.0f, false, false, 196.0f, 154.0f)
                verticalLineToRelative(48.27f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.0f, 6.57f)
                lineToRelative(-10.67f, -16.3f)
                curveToRelative(-0.13f, -0.19f, -0.25f, -0.38f, -0.36f, -0.58f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.0f, 7.77f)
                lineToRelative(22.0f, 33.66f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -20.08f, 13.14f)
                lineToRelative(-22.26f, -34.0f)
                curveToRelative(-0.12f, -0.19f, -0.24f, -0.38f, -0.35f, -0.58f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 172.0f, 168.3f)
                lineTo(172.0f, 68.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineToRelative(57.52f)
                arcTo(94.91f, 94.91f, 0.0f, false, true, 236.0f, 198.65f)
                close()
                moveTo(88.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 76.0f, 44.0f)
                lineTo(64.0f, 44.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 44.0f, 64.0f)
                lineTo(44.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(68.0f, 68.0f)
                horizontalLineToRelative(8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 56.0f)
                close()
                moveTo(156.49f, 116.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineTo(132.0f, 107.0f)
                lineTo(132.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(91.0f)
                lineToRelative(-7.51f, -7.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineToRelative(28.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                close()
            }
        }
        .build()
        return _handWithdraw!!
    }

private var _handWithdraw: ImageVector? = null

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

public val BoldGroup.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 68.0f)
                lineTo(190.06f, 68.0f)
                arcTo(33.82f, 33.82f, 0.0f, false, false, 196.0f, 49.69f)
                arcTo(36.62f, 36.62f, 0.0f, false, false, 158.31f, 12.0f)
                arcTo(33.44f, 33.44f, 0.0f, false, false, 134.0f, 23.25f)
                arcToRelative(54.65f, 54.65f, 0.0f, false, false, -6.0f, 8.3f)
                arcToRelative(54.65f, 54.65f, 0.0f, false, false, -6.0f, -8.3f)
                arcTo(33.44f, 33.44f, 0.0f, false, false, 97.69f, 12.0f)
                arcTo(36.62f, 36.62f, 0.0f, false, false, 60.0f, 49.69f)
                arcTo(33.82f, 33.82f, 0.0f, false, false, 65.94f, 68.0f)
                lineTo(40.0f, 68.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 88.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 16.0f, 19.6f)
                lineTo(36.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(200.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 139.6f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 236.0f, 120.0f)
                lineTo(236.0f, 88.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 68.0f)
                close()
                moveTo(212.0f, 116.0f)
                lineTo(140.0f, 116.0f)
                lineTo(140.0f, 92.0f)
                horizontalLineToRelative(72.0f)
                close()
                moveTo(152.0f, 39.17f)
                arcTo(9.59f, 9.59f, 0.0f, false, true, 159.0f, 36.0f)
                horizontalLineToRelative(0.35f)
                arcTo(12.62f, 12.62f, 0.0f, false, true, 172.0f, 49.0f)
                arcTo(9.59f, 9.59f, 0.0f, false, true, 168.83f, 56.0f)
                curveToRelative(-6.9f, 6.12f, -18.25f, 9.26f, -27.63f, 10.76f)
                curveTo(142.7f, 57.42f, 145.84f, 46.07f, 152.0f, 39.17f)
                close()
                moveTo(87.7f, 39.7f)
                arcTo(12.8f, 12.8f, 0.0f, false, true, 96.61f, 36.0f)
                lineTo(97.0f, 36.0f)
                arcTo(9.59f, 9.59f, 0.0f, false, true, 104.0f, 39.17f)
                curveToRelative(6.12f, 6.9f, 9.26f, 18.24f, 10.75f, 27.61f)
                curveTo(105.45f, 65.27f, 94.0f, 62.13f, 87.17f, 56.0f)
                arcTo(9.59f, 9.59f, 0.0f, false, true, 84.0f, 49.0f)
                arcTo(12.72f, 12.72f, 0.0f, false, true, 87.7f, 39.7f)
                close()
                moveTo(44.0f, 92.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(24.0f)
                lineTo(44.0f, 116.0f)
                close()
                moveTo(60.0f, 140.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(56.0f)
                lineTo(60.0f, 196.0f)
                close()
                moveTo(140.0f, 196.0f)
                lineTo(140.0f, 140.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(56.0f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null

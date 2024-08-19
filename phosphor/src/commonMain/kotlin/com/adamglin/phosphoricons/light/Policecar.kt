package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Policecar: ImageVector
    get() {
        if (_policecar != null) {
            return _policecar!!
        }
        _policecar = Builder(name = "Policecar", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 106.0f)
                lineTo(227.48f, 106.0f)
                lineToRelative(-28.0f, -48.95f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -12.15f, -7.0f)
                lineTo(68.64f, 50.05f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -12.15f, 7.0f)
                lineToRelative(-28.0f, 49.0f)
                lineTo(16.0f, 106.05f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(26.0f, 118.05f)
                verticalLineToRelative(82.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(64.0f, 214.05f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(78.0f, 182.0f)
                lineTo(178.0f, 182.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 118.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(66.91f, 63.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.73f, -1.0f)
                lineTo(187.36f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.73f, 1.0f)
                lineToRelative(24.57f, 43.0f)
                lineTo(42.34f, 106.0f)
                close()
                moveTo(66.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(40.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(38.0f, 182.0f)
                lineTo(66.0f, 182.0f)
                close()
                moveTo(216.0f, 202.0f)
                lineTo(192.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(190.0f, 182.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 216.0f, 202.0f)
                close()
                moveTo(218.0f, 170.0f)
                lineTo(38.0f, 170.0f)
                lineTo(38.0f, 118.0f)
                lineTo(218.0f, 118.0f)
                close()
                moveTo(58.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(80.0f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(64.0f, 150.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 58.0f, 144.0f)
                close()
                moveTo(170.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(176.0f, 150.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 170.0f, 144.0f)
                close()
                moveTo(98.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(104.0f, 30.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 98.0f, 24.0f)
                close()
            }
        }
        .build()
        return _policecar!!
    }

private var _policecar: ImageVector? = null

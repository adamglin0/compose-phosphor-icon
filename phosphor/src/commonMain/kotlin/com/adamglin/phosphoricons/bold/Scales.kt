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

public val BoldGroup.Scales: ImageVector
    get() {
        if (_scales != null) {
            return _scales!!
        }
        _scales = Builder(name = "Scales", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.14f, 131.54f)
                lineToRelative(-32.0f, -80.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.73f, -7.25f)
                lineTo(140.0f, 57.0f)
                lineTo(140.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(116.0f, 62.37f)
                lineTo(53.4f, 76.29f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.54f, 7.25f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.0f, 0.0f)
                verticalLineToRelative(0.0f)
                lineToRelative(-32.0f, 79.92f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 168.0f)
                curveToRelative(0.0f, 12.13f, 6.2f, 22.43f, 17.45f, 29.0f)
                arcTo(55.0f, 55.0f, 0.0f, false, false, 56.0f, 204.0f)
                arcToRelative(55.0f, 55.0f, 0.0f, false, false, 26.55f, -7.0f)
                curveTo(93.8f, 190.43f, 100.0f, 180.13f, 100.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.86f, -4.46f)
                lineTo(72.38f, 96.65f)
                lineTo(116.0f, 87.0f)
                lineTo(116.0f, 204.0f)
                lineTo(104.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(140.0f, 204.0f)
                lineTo(140.0f, 81.63f)
                lineToRelative(40.42f, -9.0f)
                lineToRelative(-23.56f, 58.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 156.0f, 136.0f)
                curveToRelative(0.0f, 12.13f, 6.2f, 22.43f, 17.45f, 29.0f)
                arcToRelative(53.78f, 53.78f, 0.0f, false, false, 53.1f, 0.0f)
                curveTo(237.8f, 158.43f, 244.0f, 148.13f, 244.0f, 136.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 243.14f, 131.54f)
                close()
                moveTo(56.0f, 180.0f)
                curveToRelative(-3.71f, 0.0f, -18.0f, -1.87f, -19.81f, -10.18f)
                lineTo(56.0f, 120.31f)
                lineToRelative(19.81f, 49.51f)
                curveTo(74.0f, 178.13f, 59.71f, 180.0f, 56.0f, 180.0f)
                close()
                moveTo(200.0f, 148.0f)
                curveToRelative(-3.71f, 0.0f, -18.0f, -1.87f, -19.81f, -10.18f)
                lineTo(200.0f, 88.31f)
                lineToRelative(19.81f, 49.51f)
                curveTo(218.0f, 146.13f, 203.71f, 148.0f, 200.0f, 148.0f)
                close()
            }
        }
        .build()
        return _scales!!
    }

private var _scales: ImageVector? = null

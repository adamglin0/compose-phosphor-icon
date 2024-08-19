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

public val BoldGroup.Baseballcap: ImageVector
    get() {
        if (_baseballcap != null) {
            return _baseballcap!!
        }
        _baseballcap = Builder(name = "Baseballcap", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 20.0f, 128.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(27.86f, 27.86f, 0.0f, false, false, 15.26f, 24.93f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 29.28f, -2.34f)
                curveTo(76.2f, 198.11f, 96.68f, 188.0f, 128.0f, 188.0f)
                reflectiveCurveToRelative(51.8f, 10.1f, 63.46f, 18.58f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 236.0f, 184.0f)
                lineTo(236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(212.0f, 128.0f)
                verticalLineToRelative(1.87f)
                arcToRelative(170.0f, 170.0f, 0.0f, false, false, -33.29f, -14.3f)
                arcToRelative(170.81f, 170.81f, 0.0f, false, false, -23.45f, -67.0f)
                arcTo(84.14f, 84.14f, 0.0f, false, true, 212.0f, 128.0f)
                close()
                moveTo(153.54f, 109.88f)
                arcToRelative(174.42f, 174.42f, 0.0f, false, false, -51.08f, 0.0f)
                arcTo(150.0f, 150.0f, 0.0f, false, true, 128.0f, 50.94f)
                arcTo(150.07f, 150.07f, 0.0f, false, true, 153.54f, 109.88f)
                close()
                moveTo(100.74f, 48.57f)
                arcToRelative(170.81f, 170.81f, 0.0f, false, false, -23.45f, 67.0f)
                arcTo(170.0f, 170.0f, 0.0f, false, false, 44.0f, 129.87f)
                lineTo(44.0f, 128.0f)
                arcTo(84.14f, 84.14f, 0.0f, false, true, 100.74f, 48.57f)
                close()
                moveTo(209.85f, 187.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.28f, -0.36f)
                curveTo(191.0f, 176.61f, 165.77f, 164.0f, 128.0f, 164.0f)
                reflectiveCurveToRelative(-63.0f, 12.61f, -77.57f, 23.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.28f, 0.36f)
                arcTo(3.76f, 3.76f, 0.0f, false, true, 44.0f, 184.0f)
                lineTo(44.0f, 158.14f)
                arcToRelative(148.0f, 148.0f, 0.0f, false, true, 168.0f, 0.0f)
                lineTo(212.0f, 184.0f)
                arcTo(3.76f, 3.76f, 0.0f, false, true, 209.85f, 187.54f)
                close()
            }
        }
        .build()
        return _baseballcap!!
    }

private var _baseballcap: ImageVector? = null

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

public val BoldGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.0f, 76.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 196.0f, 76.0f)
                close()
                moveTo(244.0f, 98.74f)
                arcTo(84.3f, 84.3f, 0.0f, false, true, 160.11f, 180.0f)
                lineTo(160.0f, 180.0f)
                arcToRelative(83.52f, 83.52f, 0.0f, false, true, -23.65f, -3.38f)
                lineToRelative(-7.86f, 7.87f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 120.0f, 188.0f)
                lineTo(108.0f, 188.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(84.0f, 212.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(40.0f, 236.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(20.0f, 187.31f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, true, 5.86f, -14.14f)
                lineToRelative(53.52f, -53.52f)
                arcTo(84.0f, 84.0f, 0.0f, true, true, 244.0f, 98.74f)
                close()
                moveTo(202.43f, 53.57f)
                arcTo(59.48f, 59.48f, 0.0f, false, false, 158.0f, 36.0f)
                curveToRelative(-32.0f, 1.0f, -58.0f, 27.89f, -58.0f, 59.89f)
                arcToRelative(59.69f, 59.69f, 0.0f, false, false, 4.2f, 22.19f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -2.55f, 13.21f)
                lineTo(44.0f, 189.0f)
                verticalLineToRelative(23.0f)
                lineTo(60.0f, 212.0f)
                lineTo(60.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                lineTo(84.0f, 188.0f)
                lineTo(84.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(19.0f)
                lineToRelative(9.65f, -9.65f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.22f, -2.55f)
                arcTo(59.58f, 59.58f, 0.0f, false, false, 160.0f, 156.0f)
                horizontalLineToRelative(0.08f)
                curveToRelative(32.0f, 0.0f, 58.87f, -26.07f, 59.89f, -58.0f)
                arcTo(59.55f, 59.55f, 0.0f, false, false, 202.43f, 53.57f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null

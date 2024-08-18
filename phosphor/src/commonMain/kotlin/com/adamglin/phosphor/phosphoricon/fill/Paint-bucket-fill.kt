package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Paint-bucket-fill`: ImageVector
    get() {
        if (`_paint-bucket-fill` != null) {
            return `_paint-bucket-fill`!!
        }
        `_paint-bucket-fill` = Builder(name = "Paint-bucket-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 208.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f)
                curveToRelative(0.0f, -17.91f, 15.57f, -41.77f, 17.34f, -44.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.32f, 0.0f)
                curveTo(240.43f, 166.23f, 256.0f, 190.09f, 256.0f, 208.0f)
                close()
                moveTo(132.49f, 124.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineToRelative(0.0f, 0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 16.94f)
                close()
                moveTo(37.65f, 18.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 26.34f, 29.66f)
                lineToRelative(32.6f, 32.6f)
                lineTo(70.25f, 51.0f)
                close()
                moveTo(234.53f, 139.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.13f, -13.24f)
                lineTo(122.17f, 10.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, 0.0f)
                lineTo(70.25f, 51.0f)
                lineToRelative(40.43f, 40.42f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -11.31f, 11.32f)
                lineTo(58.94f, 62.26f)
                lineTo(15.0f, 106.17f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, 33.94f)
                lineTo(99.89f, 225.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 33.94f, 0.0f)
                lineToRelative(78.49f, -78.49f)
                close()
            }
        }
        .build()
        return `_paint-bucket-fill`!!
    }

private var `_paint-bucket-fill`: ImageVector? = null
